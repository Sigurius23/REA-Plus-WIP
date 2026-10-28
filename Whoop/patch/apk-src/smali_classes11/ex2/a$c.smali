.class final Lex2/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/a;->c(Lcom/whoop/whooplabs/data/domain/DwlLanding;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.data.repositories.DwlLandingRepository"
    f = "DwlLandingRepository.kt"
    l = {
        0x39
    }
    m = "saveCampaigns$whooplabs_release"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lex2/a;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lex2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/a;",
            "Lq83/d<",
            "-",
            "Lex2/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/a$c;->I:Lex2/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lex2/a$c;->H:Ljava/lang/Object;

    iget p1, p0, Lex2/a$c;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lex2/a$c;->J:I

    iget-object p1, p0, Lex2/a$c;->I:Lex2/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lex2/a;->c(Lcom/whoop/whooplabs/data/domain/DwlLanding;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
