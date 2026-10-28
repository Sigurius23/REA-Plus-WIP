.class public abstract Landroidx/compose/ui/input/nestedscroll/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;-><init>(Lt2/a;Lt2/d;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
