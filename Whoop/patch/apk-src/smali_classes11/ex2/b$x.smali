.class final Lex2/b$x;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->r(ILjava/util/Map;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository"
    f = "LabsCampaignsRepository.kt"
    l = {
        0x1c7
    }
    m = "submitScreening"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lex2/b;

.field F:I

.field w:I

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lex2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/b;",
            "Lq83/d<",
            "-",
            "Lex2/b$x;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$x;->E:Lex2/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lex2/b$x;->z:Ljava/lang/Object;

    iget p1, p0, Lex2/b$x;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lex2/b$x;->F:I

    iget-object p1, p0, Lex2/b$x;->E:Lex2/b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lex2/b;->r(ILjava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
