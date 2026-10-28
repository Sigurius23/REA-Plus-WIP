.class public final Lkx2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0011J\u0019\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u000e2\u0006\u0010\u0013\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkx2/b;",
        "",
        "Lex2/b;",
        "labsCampaignRepository",
        "Lzw2/b;",
        "analytics",
        "Lcom/whoop/whooplabs/a;",
        "labsServiceConnector",
        "Lex2/c;",
        "labsRepository",
        "<init>",
        "(Lex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Lex2/c;)V",
        "",
        "campaignId",
        "Lax2/a;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "d",
        "(I)Lax2/a;",
        "Lmx2/b$a;",
        "action",
        "Ll83/a0;",
        "a",
        "(Lmx2/b$a;)Lax2/a;",
        "b",
        "Lmx2/b;",
        "c",
        "(Lmx2/b;)Lax2/a;",
        "Lex2/b;",
        "Lzw2/b;",
        "Lcom/whoop/whooplabs/a;",
        "Lex2/c;",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lex2/b;

.field private final b:Lzw2/b;

.field private final c:Lcom/whoop/whooplabs/a;

.field private final d:Lex2/c;


# direct methods
.method public constructor <init>(Lex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Lex2/c;)V
    .locals 1

    const-string v0, "labsCampaignRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labsServiceConnector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx2/b;->a:Lex2/b;

    iput-object p2, p0, Lkx2/b;->b:Lzw2/b;

    iput-object p3, p0, Lkx2/b;->c:Lcom/whoop/whooplabs/a;

    iput-object p4, p0, Lkx2/b;->d:Lex2/c;

    return-void
.end method


# virtual methods
.method public final a(Lmx2/b$a;)Lax2/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx2/b$a;",
            ")",
            "Lax2/a<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkx2/a;

    iget-object v1, p0, Lkx2/b;->a:Lex2/b;

    sget-object v2, Lkx2/a;->d:Lkx2/a$a;

    invoke-virtual {v2}, Lkx2/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lkx2/a;-><init>(Lmx2/b$a;Lex2/b;Ltr2/n;)V

    return-object v0
.end method

.method public final b(I)Lax2/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lax2/a<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkx2/c;

    iget-object v2, p0, Lkx2/b;->a:Lex2/b;

    iget-object v3, p0, Lkx2/b;->b:Lzw2/b;

    iget-object v4, p0, Lkx2/b;->c:Lcom/whoop/whooplabs/a;

    sget-object v1, Lkx2/c;->f:Lkx2/c$a;

    invoke-virtual {v1}, Lkx2/c$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lkx2/c;-><init>(ILex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Ltr2/n;)V

    return-object v0
.end method

.method public final c(Lmx2/b;)Lax2/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx2/b;",
            ")",
            "Lax2/a<",
            "*>;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lmx2/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lmx2/b$a;

    invoke-virtual {p0, p1}, Lkx2/b;->a(Lmx2/b$a;)Lax2/a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lmx2/b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lmx2/b$b;

    invoke-virtual {p1}, Lmx2/b$b;->b()I

    move-result p1

    invoke-virtual {p0, p1}, Lkx2/b;->b(I)Lax2/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lmx2/b$d;

    if-eqz v0, :cond_2

    new-instance v0, Lkx2/e;

    check-cast p1, Lmx2/b$d;

    sget-object v1, Lkx2/e;->c:Lkx2/e$a;

    invoke-virtual {v1}, Lkx2/e$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lkx2/e;-><init>(Lmx2/b$d;Ltr2/n;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lmx2/b$c;

    if-eqz v0, :cond_3

    check-cast p1, Lmx2/b$c;

    invoke-virtual {p1}, Lmx2/b$c;->b()I

    move-result p1

    invoke-virtual {p0, p1}, Lkx2/b;->b(I)Lax2/a;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(I)Lax2/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lax2/a<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkx2/d;

    iget-object v1, p0, Lkx2/b;->a:Lex2/b;

    sget-object v2, Lkx2/d;->d:Lkx2/d$a;

    invoke-virtual {v2}, Lkx2/d$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lkx2/d;-><init>(ILex2/b;Ltr2/n;)V

    return-object v0
.end method
