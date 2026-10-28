.class public final Lrb3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lva3/h;

.field public final b:Lyb3/p;

.field public final c:Ljava/util/Collection;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:[Lrb3/e;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;[Lrb3/e;)V
    .locals 1

    .line 9
    sget-object v0, Lrb3/h;->z:Lrb3/h;

    invoke-direct {p0, p1, p2, v0}, Lrb3/i;-><init>(Ljava/util/Collection;[Lrb3/e;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[Lrb3/e;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    const-string v0, "nameList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lrb3/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lrb3/i;-><init>(Lva3/h;Lyb3/p;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;[Lrb3/e;)V

    return-void
.end method

.method public varargs constructor <init>(Lva3/h;Lyb3/p;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;[Lrb3/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrb3/i;->a:Lva3/h;

    .line 3
    iput-object p2, p0, Lrb3/i;->b:Lyb3/p;

    .line 4
    iput-object p3, p0, Lrb3/i;->c:Ljava/util/Collection;

    .line 5
    iput-object p4, p0, Lrb3/i;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object p5, p0, Lrb3/i;->e:[Lrb3/e;

    return-void
.end method

.method public synthetic constructor <init>(Lva3/h;[Lrb3/e;)V
    .locals 1

    .line 7
    sget-object v0, Lrb3/h;->x:Lrb3/h;

    invoke-direct {p0, p1, p2, v0}, Lrb3/i;-><init>(Lva3/h;[Lrb3/e;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Lva3/h;[Lrb3/e;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lrb3/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lrb3/i;-><init>(Lva3/h;Lyb3/p;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;[Lrb3/e;)V

    return-void
.end method
