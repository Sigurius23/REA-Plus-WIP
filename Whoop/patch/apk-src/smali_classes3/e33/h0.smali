.class public final Le33/h0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Le33/j0;


# direct methods
.method public constructor <init>(Le33/j0;)V
    .locals 0

    iput-object p1, p0, Le33/h0;->w:Le33/j0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lf33/a;

    iget-object v1, p0, Le33/h0;->w:Le33/j0;

    iget-object v1, v1, Le33/j0;->d:Lt23/l;

    invoke-virtual {v1}, Lt23/l;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/EglBase;

    invoke-interface {v1}, Lorg/webrtc/EglBase;->getEglBaseContext()Lorg/webrtc/EglBase$Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lf33/a;-><init>(Lorg/webrtc/EglBase$Context;)V

    return-object v0
.end method
