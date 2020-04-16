// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/summary.proto

package org.tensorflow.proto.framework;

public interface SummaryMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SummaryMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Data that associates a summary with a certain plugin.
   * </pre>
   *
   * <code>.tensorflow.SummaryMetadata.PluginData plugin_data = 1;</code>
   */
  boolean hasPluginData();
  /**
   * <pre>
   * Data that associates a summary with a certain plugin.
   * </pre>
   *
   * <code>.tensorflow.SummaryMetadata.PluginData plugin_data = 1;</code>
   */
  org.tensorflow.proto.framework.SummaryMetadata.PluginData getPluginData();
  /**
   * <pre>
   * Data that associates a summary with a certain plugin.
   * </pre>
   *
   * <code>.tensorflow.SummaryMetadata.PluginData plugin_data = 1;</code>
   */
  org.tensorflow.proto.framework.SummaryMetadata.PluginDataOrBuilder getPluginDataOrBuilder();

  /**
   * <pre>
   * Display name for viewing in TensorBoard.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name for viewing in TensorBoard.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Longform readable description of the summary sequence. Markdown supported.
   * </pre>
   *
   * <code>string summary_description = 3;</code>
   */
  java.lang.String getSummaryDescription();
  /**
   * <pre>
   * Longform readable description of the summary sequence. Markdown supported.
   * </pre>
   *
   * <code>string summary_description = 3;</code>
   */
  com.google.protobuf.ByteString
      getSummaryDescriptionBytes();

  /**
   * <pre>
   * Class of data stored in this time series. Required for compatibility with
   * TensorBoard's generic data facilities (`DataProvider`, et al.). This value
   * imposes constraints on the dtype and shape of the corresponding tensor
   * values. See `DataClass` docs for details.
   * </pre>
   *
   * <code>.tensorflow.DataClass data_class = 4;</code>
   */
  int getDataClassValue();
  /**
   * <pre>
   * Class of data stored in this time series. Required for compatibility with
   * TensorBoard's generic data facilities (`DataProvider`, et al.). This value
   * imposes constraints on the dtype and shape of the corresponding tensor
   * values. See `DataClass` docs for details.
   * </pre>
   *
   * <code>.tensorflow.DataClass data_class = 4;</code>
   */
  org.tensorflow.proto.framework.DataClass getDataClass();
}