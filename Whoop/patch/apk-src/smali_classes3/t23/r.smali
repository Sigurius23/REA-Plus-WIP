.class public final Lt23/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lt23/c0;


# direct methods
.method public constructor <init>(Lt23/c0;)V
    .locals 0

    iput-object p1, p0, Lt23/r;->w:Lt23/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    new-instance v0, Lt23/x1;

    iget-object v2, p0, Lt23/r;->w:Lt23/c0;

    iget-object v1, v2, Lt23/c0;->g:Lt23/b4;

    move-object v3, v1

    iget-object v1, v3, Lt23/b4;->w:Landroid/content/Context;

    move-object v4, v3

    iget-object v3, v2, Lt23/c0;->n:Lhc3/d;

    iget-object v5, v2, Lt23/c0;->I:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "getValue(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lorg/webrtc/EglBase;

    invoke-interface {v5}, Lorg/webrtc/EglBase;->getEglBaseContext()Lorg/webrtc/EglBase$Context;

    move-result-object v5

    const-string v6, "getEglBaseContext(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Lt23/b4;->K:Lbi/p;

    iget-object v6, v2, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v4

    iget v4, v4, Lj43/c;->b:I

    new-instance v6, Lt23/l;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Lt23/l;-><init>(Lt23/c0;I)V

    move-object v8, v5

    move v5, v4

    move-object v4, v8

    invoke-direct/range {v0 .. v6}, Lt23/x1;-><init>(Landroid/content/Context;Lt23/c0;Lhc3/d;Lorg/webrtc/EglBase$Context;ILt23/l;)V

    return-object v0
.end method
