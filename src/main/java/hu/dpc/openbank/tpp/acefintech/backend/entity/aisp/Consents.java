/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */

package hu.dpc.openbank.tpp.acefintech.backend.entity.aisp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import uk.org.openbanking.v3_1_2.parser.LocalFormatDateTimeDeserializer;
import uk.org.openbanking.v3_1_2.parser.LocalFormatDateTimeSerializer;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consents {

  @JsonProperty("Permissions")
  public List<String> permissions;

  @JsonSerialize(using = LocalFormatDateTimeSerializer.class)
  @JsonDeserialize(using = LocalFormatDateTimeDeserializer.class)
  @JsonProperty("ExpirationDateTime")
  public LocalDateTime expirationDateTime;

  @JsonProperty("TransactionFromDateTime")
  @JsonSerialize(using = LocalFormatDateTimeSerializer.class)
  @JsonDeserialize(using = LocalFormatDateTimeDeserializer.class)
  public LocalDateTime transactionFromDateTime;

  @JsonProperty("TransactionToDateTime")
  @JsonSerialize(using = LocalFormatDateTimeSerializer.class)
  @JsonDeserialize(using = LocalFormatDateTimeDeserializer.class)
  public LocalDateTime transactionToDateTime;
  
  @JsonProperty("ConsentId")
  private String consentId;
}
