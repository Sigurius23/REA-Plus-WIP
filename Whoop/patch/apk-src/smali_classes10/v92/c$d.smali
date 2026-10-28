.class final Lv92/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92/c;->m(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.store.encrypted.EncryptedAuthStore"
    f = "EncryptedAuthStore.kt"
    l = {
        0x46,
        0x51,
        0x52
    }
    m = "getAuthMaterialDataStore"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lv92/c;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lv92/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv92/c;",
            "Lq83/d<",
            "-",
            "Lv92/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv92/c$d;->I:Lv92/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv92/c$d;->H:Ljava/lang/Object;

    iget p1, p0, Lv92/c$d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv92/c$d;->J:I

    iget-object p1, p0, Lv92/c$d;->I:Lv92/c;

    invoke-virtual {p1, p0}, Lv92/c;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
