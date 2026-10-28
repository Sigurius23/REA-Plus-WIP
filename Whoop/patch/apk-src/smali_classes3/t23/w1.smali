.class public final Lt23/w1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lt23/x1;


# direct methods
.method public constructor <init>(Lt23/x1;)V
    .locals 0

    iput-object p1, p0, Lt23/w1;->w:Lt23/x1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt23/w1;->w:Lt23/x1;

    iget-object v0, v0, Lt23/x1;->h:Lt23/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "surfaceTextureHelper"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
