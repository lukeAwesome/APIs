/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ListOfConnectionTypes
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * This is an example opeartion to show how security is applied to the call.
   * 
   * Expected answers:
   *   code 202 : ListOfConnectionTypes (Success)
   */
  def componentTypesGet(): ApiRequest[ListOfConnectionTypes] =
    ApiRequest[ListOfConnectionTypes](ApiMethods.GET, "https://virtserver.swaggerhub.com/lukeAwesome/ecocomposer-meta-model/1.0.0", "/component_types", "application/json")
      .withSuccessResponse[ListOfConnectionTypes](202)
      

}

