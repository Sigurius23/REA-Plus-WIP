.class public final Lu2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/u;


# instance fields
.field public w:Lb4/e;

.field public x:Ls;

.field public y:Z

.field public final z:Lq/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq/f;

    invoke-direct {v0, p0}, Lq/f;-><init>(Lu2/y;)V

    iput-object v0, p0, Lu2/y;->z:Lq/f;

    return-void
.end method


# virtual methods
.method public final j()Lq/f;
    .locals 1

    iget-object v0, p0, Lu2/y;->z:Lq/f;

    return-object v0
.end method
