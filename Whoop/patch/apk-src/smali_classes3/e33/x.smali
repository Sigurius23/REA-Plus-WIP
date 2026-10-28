.class public final Le33/x;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Le33/j0;


# direct methods
.method public constructor <init>(Le33/j0;)V
    .locals 0

    iput-object p1, p0, Le33/x;->w:Le33/j0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le33/x;->w:Le33/j0;

    iget-object v0, v0, Le33/j0;->d:Lt23/l;

    iget-object v0, v0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->f()Lorg/webrtc/EglBase;

    move-result-object v0

    return-object v0
.end method
