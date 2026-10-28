.class public final Lwv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/l;
.implements Lev/j;


# instance fields
.field public final w:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwv/a;->w:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lwv/a;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final f(Lev/i;)V
    .locals 0

    return-void
.end method

.method public final initialize()V
    .locals 0

    return-void
.end method

.method public final onSizeChanged(II)V
    .locals 0

    return-void
.end method
