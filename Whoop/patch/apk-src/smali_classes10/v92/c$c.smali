.class final Lv92/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92/c;->l(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x76
    }
    m = "encrypt"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lv92/c;


# direct methods
.method public constructor <init>(Lv92/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv92/c;",
            "Lq83/d<",
            "-",
            "Lv92/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv92/c$c;->z:Lv92/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv92/c$c;->y:Ljava/lang/Object;

    iget p1, p0, Lv92/c$c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv92/c$c;->E:I

    iget-object p1, p0, Lv92/c$c;->z:Lv92/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lv92/c;->b(Lv92/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
