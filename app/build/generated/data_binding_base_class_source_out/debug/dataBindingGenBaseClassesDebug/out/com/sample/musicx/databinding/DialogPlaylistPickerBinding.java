// Generated by data binding compiler. Do not edit!
package com.sample.musicx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sample.musicx.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogPlaylistPickerBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView playlistPickerRecyclerView;

  protected DialogPlaylistPickerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView playlistPickerRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.playlistPickerRecyclerView = playlistPickerRecyclerView;
  }

  @NonNull
  public static DialogPlaylistPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_playlist_picker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogPlaylistPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogPlaylistPickerBinding>inflateInternal(inflater, R.layout.dialog_playlist_picker, root, attachToRoot, component);
  }

  @NonNull
  public static DialogPlaylistPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_playlist_picker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogPlaylistPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogPlaylistPickerBinding>inflateInternal(inflater, R.layout.dialog_playlist_picker, null, false, component);
  }

  public static DialogPlaylistPickerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogPlaylistPickerBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogPlaylistPickerBinding)bind(component, view, R.layout.dialog_playlist_picker);
  }
}