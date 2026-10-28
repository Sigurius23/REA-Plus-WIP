.class public final Lqw1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lqw1/b;",
        "Lqw1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lqw1/d;",
        "Lod1/g;",
        "Lqw1/b;",
        "Lqw1/c;",
        "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;",
        "familyPlanApi",
        "Lqw1/f;",
        "processInviteErrorParser",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;)V",
        "previousResult",
        "action",
        "j",
        "(Lqw1/c;Lqw1/b;)Lqw1/c;",
        "",
        "isNewMember",
        "Lec3/l;",
        "k",
        "(Z)Lec3/l;",
        "",
        "email",
        "Lqw1/e;",
        "l",
        "(Ljava/lang/String;)Lec3/l;",
        "m",
        "(Ljava/lang/String;)Z",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;",
        "b",
        "Lqw1/f;",
        "c",
        "Ltr2/n;",
        "membership_release"
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
.field private final a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

.field private final b:Lqw1/f;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;)V
    .locals 1

    const-string v0, "familyPlanApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processInviteErrorParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqw1/d;->a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    .line 3
    iput-object p2, p0, Lqw1/d;->b:Lqw1/f;

    .line 4
    iput-object p3, p0, Lqw1/d;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "InviteFamilyMemberInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lqw1/d;-><init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lqw1/d;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;
    .locals 0

    iget-object p0, p0, Lqw1/d;->a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    return-object p0
.end method

.method public static final synthetic d(Lqw1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lqw1/d;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lqw1/d;)Lqw1/f;
    .locals 0

    iget-object p0, p0, Lqw1/d;->b:Lqw1/f;

    return-object p0
.end method

.method public static final synthetic f(Lqw1/d;Lqw1/c;Lqw1/b;)Lqw1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lqw1/d;->j(Lqw1/c;Lqw1/b;)Lqw1/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lqw1/d;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lqw1/d;->k(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lqw1/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lqw1/d;->l(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lqw1/d;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lqw1/d;->m(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final j(Lqw1/c;Lqw1/b;)Lqw1/c;
    .locals 8

    instance-of v0, p2, Lqw1/b$b;

    if-eqz v0, :cond_0

    check-cast p2, Lqw1/b$b;

    invoke-virtual {p2}, Lqw1/b$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p1

    instance-of p1, p2, Lqw1/b$a;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final k(Z)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lqw1/d$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lqw1/d$h;-><init>(Lqw1/d;ZLq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final l(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lqw1/d$i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lqw1/d$i;-><init>(Lqw1/d;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final m(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_0

    const-string v0, "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    new-instance v0, Lqw1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lqw1/d$a;-><init>(Lq83/d;Lqw1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lqw1/c;

    sget-object v3, Lqw1/a$c;->a:Lqw1/a$c;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lqw1/c;-><init>(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lqw1/d$e;

    invoke-direct {v0, p0, v1}, Lqw1/d$e;-><init>(Lqw1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
