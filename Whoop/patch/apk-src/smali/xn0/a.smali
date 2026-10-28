.class public final Lxn0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxn0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lxn0/b;",
        "Lxn0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lxn0/a;",
        "Lod1/g;",
        "Lxn0/b;",
        "Lxn0/c;",
        "Lwn0/d;",
        "passwordResetSubmissionHandler",
        "Lwn0/b;",
        "passwordRequirementsFetcher",
        "Lxn0/d;",
        "sendNewResetLinkHandler",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lwn0/d;Lwn0/b;Lxn0/d;Ltr2/n;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lwn0/d;",
        "b",
        "Lwn0/b;",
        "c",
        "Lxn0/d;",
        "d",
        "Ltr2/n;",
        "e",
        "Lxn0/c;",
        "initialDomainResult",
        "change-password_release"
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
.field private final a:Lwn0/d;

.field private final b:Lwn0/b;

.field private final c:Lxn0/d;

.field private final d:Ltr2/n;

.field private final e:Lxn0/c;


# direct methods
.method public constructor <init>(Lwn0/d;Lwn0/b;Lxn0/d;Ltr2/n;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "passwordResetSubmissionHandler"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "passwordRequirementsFetcher"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sendNewResetLinkHandler"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "logger"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lxn0/a;->a:Lwn0/d;

    .line 3
    iput-object v2, v0, Lxn0/a;->b:Lwn0/b;

    .line 4
    iput-object v3, v0, Lxn0/a;->c:Lxn0/d;

    .line 5
    iput-object v4, v0, Lxn0/a;->d:Ltr2/n;

    .line 6
    new-instance v6, Lxn0/c;

    const/16 v18, 0x7ff

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lxn0/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lxn0/a;->e:Lxn0/c;

    return-void
.end method

.method public synthetic constructor <init>(Lwn0/d;Lwn0/b;Lxn0/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "PasswordResetInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lxn0/a;-><init>(Lwn0/d;Lwn0/b;Lxn0/d;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lxn0/a;)Lwn0/b;
    .locals 0

    iget-object p0, p0, Lxn0/a;->b:Lwn0/b;

    return-object p0
.end method

.method public static final synthetic d(Lxn0/a;)Lwn0/d;
    .locals 0

    iget-object p0, p0, Lxn0/a;->a:Lwn0/d;

    return-object p0
.end method

.method public static final synthetic e(Lxn0/a;)Lxn0/d;
    .locals 0

    iget-object p0, p0, Lxn0/a;->c:Lxn0/d;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxn0/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lxn0/a$b;-><init>(Lq83/d;Lxn0/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iget-object v0, p0, Lxn0/a;->e:Lxn0/c;

    new-instance v2, Lxn0/a$f;

    invoke-direct {v2, v1}, Lxn0/a$f;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
