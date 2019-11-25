package com.sample.musicx.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/musicx/adapters/PlaylistPickerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/sample/musicx/model/Playlist;", "Lcom/sample/musicx/adapters/PlaylistPickerAdapter$PlaylistPickerViewHolder;", "handler", "Lcom/sample/musicx/handlers/PlaylistPickerHandler;", "(Lcom/sample/musicx/handlers/PlaylistPickerHandler;)V", "getHandler", "()Lcom/sample/musicx/handlers/PlaylistPickerHandler;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PlaylistPickerViewHolder", "app_debug"})
public final class PlaylistPickerAdapter extends androidx.recyclerview.widget.ListAdapter<com.sample.musicx.model.Playlist, com.sample.musicx.adapters.PlaylistPickerAdapter.PlaylistPickerViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.sample.musicx.handlers.PlaylistPickerHandler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.musicx.adapters.PlaylistPickerAdapter.PlaylistPickerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.adapters.PlaylistPickerAdapter.PlaylistPickerViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.handlers.PlaylistPickerHandler getHandler() {
        return null;
    }
    
    public PlaylistPickerAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.handlers.PlaylistPickerHandler handler) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sample/musicx/adapters/PlaylistPickerAdapter$PlaylistPickerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sample/musicx/databinding/ItemPlaylistPickerBinding;", "(Lcom/sample/musicx/adapters/PlaylistPickerAdapter;Lcom/sample/musicx/databinding/ItemPlaylistPickerBinding;)V", "bind", "", "playlist", "Lcom/sample/musicx/model/Playlist;", "app_debug"})
    public final class PlaylistPickerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.sample.musicx.databinding.ItemPlaylistPickerBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.model.Playlist playlist) {
        }
        
        public PlaylistPickerViewHolder(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.databinding.ItemPlaylistPickerBinding binding) {
            super(null);
        }
    }
}