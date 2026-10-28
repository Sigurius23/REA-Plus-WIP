.class public final Lu50/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lu50/a;",
        "Lu50/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lu50/c;",
        "Lod1/g;",
        "Lu50/a;",
        "Lu50/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "Lec3/l;",
        "d",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "access_release"
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
.field private final a:Lnm0/e;


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu50/c;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lu50/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lu50/c;->d()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/access/omronauth/domain/GetOmronAuthRequest;

    invoke-direct {v0}, Lcom/whoop/access/omronauth/domain/GetOmronAuthRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "AccessOmronAuthScope"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lu50/c;->a:Lnm0/e;

    new-instance v2, Lu50/c$e;

    invoke-direct {v2, v3, v1}, Lu50/c$e;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lu50/c$f;

    invoke-direct {v1, v0}, Lu50/c$f;-><init>(Lec3/l;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
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

    new-instance v0, Lu50/c$a;

    invoke-direct {v0, p1}, Lu50/c$a;-><init>(Lec3/l;)V

    new-instance v1, Lu50/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Lu50/c$c;-><init>(Lq83/d;Lu50/c;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lu50/c$b;

    invoke-direct {v1, p1}, Lu50/c$b;-><init>(Lec3/l;)V

    const/4 p1, 0x2

    new-array p1, p1, [Lec3/l;

    const/4 v3, 0x0

    aput-object v0, p1, v3

    const/4 v0, 0x1

    aput-object v1, p1, v0

    invoke-static {p1}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p1

    new-instance v3, Lu50/b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lu50/b;-><init>(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lu50/c$d;

    invoke-direct {v0, v2}, Lu50/c$d;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v3, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
