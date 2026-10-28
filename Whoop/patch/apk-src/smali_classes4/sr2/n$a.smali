.class final Lsr2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhh/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsr2/n;->define()Ltf3/a;
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


# instance fields
.field final synthetic a:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field final synthetic b:Lcom/whoop/data/repositories/DefaultLanguageDecider;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)V
    .locals 0

    iput-object p1, p0, Lsr2/n$a;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p2, p0, Lsr2/n$a;->b:Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhh/h;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhh/h;",
            "Lq83/d<",
            "-",
            "Lmh/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p1, Lhh/k;

    iget-object v0, p1, Lhh/k;->d:Lmh/j;

    invoke-static {v0}, Lmh/j;->a(Lmh/j;)Lmh/h;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/repositories/LanguageRepository;->Companion:Lcom/whoop/data/repositories/LanguageRepository$Companion;

    iget-object v2, p0, Lsr2/n$a;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iget-object v3, p0, Lsr2/n$a;->b:Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-virtual {v1, v2, v3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->getAcceptLanguageHeaderValue(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lmh/h;->k:Lkotlin/jvm/internal/k0;

    if-nez v2, :cond_0

    new-instance v2, Lkotlin/jvm/internal/k0;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iput-object v2, v0, Lmh/h;->k:Lkotlin/jvm/internal/k0;

    :cond_0
    const-string v3, "Accept-Language"

    invoke-virtual {v2, v3, v1}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lmh/h;->a()Lmh/j;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lhh/k;->b(Lmh/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
