.class public final Lod1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\n\u0010\u0008\"\u0004\u0008\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0011\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lod1/j;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "d",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "a",
        "I",
        "c",
        "()I",
        "g",
        "(I)V",
        "provisionalUserId",
        "b",
        "Ljava/lang/String;",
        "e",
        "(Ljava/lang/String;)V",
        "accessToken",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "()Lcom/whoop/domain/model/AuthMaterial;",
        "f",
        "(Lcom/whoop/domain/model/AuthMaterial;)V",
        "pendingAuthMaterial",
        "core_release"
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
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lcom/whoop/domain/model/AuthMaterial;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lod1/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/whoop/domain/model/AuthMaterial;
    .locals 1

    iget-object v0, p0, Lod1/j;->c:Lcom/whoop/domain/model/AuthMaterial;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lod1/j;->a:I

    return v0
.end method

.method public final d()V
    .locals 4

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "PendingUserSession"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "reset"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput v1, p0, Lod1/j;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lod1/j;->b:Ljava/lang/String;

    iput-object v0, p0, Lod1/j;->c:Lcom/whoop/domain/model/AuthMaterial;

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lod1/j;->b:Ljava/lang/String;

    return-void
.end method

.method public final f(Lcom/whoop/domain/model/AuthMaterial;)V
    .locals 0

    iput-object p1, p0, Lod1/j;->c:Lcom/whoop/domain/model/AuthMaterial;

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lod1/j;->a:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lod1/j;->a:I

    const-string v1, "PendingUserSessionRepository(provisionalUserId="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
