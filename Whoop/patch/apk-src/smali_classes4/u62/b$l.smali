.class final Lu62/b$l;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu62/b;->w(Lq83/d;)Ljava/lang/Object;
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
        0x61,
        0x4a,
        0x4c,
        0x57,
        0x61,
        0x61,
        0x61
    }
    m = "startFetchRemoteDeviceConfigs"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lu62/b;

.field F:I

.field w:J

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu62/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu62/b;",
            "Lq83/d<",
            "-",
            "Lu62/b$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu62/b$l;->E:Lu62/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu62/b$l;->z:Ljava/lang/Object;

    iget p1, p0, Lu62/b$l;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu62/b$l;->F:I

    iget-object p1, p0, Lu62/b$l;->E:Lu62/b;

    invoke-virtual {p1, p0}, Lu62/b;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
