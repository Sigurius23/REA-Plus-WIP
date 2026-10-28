.class public final Ll22/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ll22/a;",
        "",
        "<init>",
        "()V",
        "Lk22/b;",
        "domainResult",
        "Lk22/d;",
        "a",
        "(Lk22/b;)Lk22/d;",
        "pairing-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk22/b;)Lk22/d;
    .locals 10

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lk22/b$c;

    if-eqz v0, :cond_0

    check-cast p1, Lk22/b$c;

    invoke-virtual {p1}, Lk22/b$c;->a()Ljava/util/List;

    move-result-object v2

    new-instance v0, Lk22/d;

    const/16 v7, 0x39

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lk22/d;-><init>(ZLjava/util/List;ZZLqt0/b;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    instance-of p1, p1, Lk22/b$b;

    if-eqz p1, :cond_1

    new-instance v0, Lk22/d;

    const/16 v7, 0x37

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lk22/d;-><init>(ZLjava/util/List;ZZLqt0/b;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance v1, Lk22/d;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lk22/d;-><init>(ZLjava/util/List;ZZLqt0/b;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
