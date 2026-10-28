.class final Lu62/b$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu62/b;->n(Lzj0/y0;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor"
    f = "RemoteDeviceConfigInteractor.kt"
    l = {
        0xf3
    }
    m = "retrieveStrapPropertiesCrp"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lu62/b;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu62/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu62/b;",
            "Lq83/d<",
            "-",
            "Lu62/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu62/b$e;->I:Lu62/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu62/b$e;->H:Ljava/lang/Object;

    iget p1, p0, Lu62/b$e;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu62/b$e;->J:I

    iget-object p1, p0, Lu62/b$e;->I:Lu62/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lu62/b;->c(Lu62/b;Lzj0/y0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
