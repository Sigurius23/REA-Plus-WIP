.class final Lnq0/i$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq0/i$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
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
.field final synthetic w:Lnq0/i;


# direct methods
.method public constructor <init>(Lnq0/i;)V
    .locals 0

    iput-object p1, p0, Lnq0/i$j$a;->w:Lnq0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Li92/h;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li92/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Li92/h;->a()Z

    move-result v1

    iget-object v2, v0, Lnq0/i$j$a;->w:Lnq0/i;

    invoke-static {v2}, Lnq0/i;->S(Lnq0/i;)Lnq0/j;

    move-result-object v2

    invoke-virtual {v2}, Lnq0/j;->m()Z

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Li92/h;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lnq0/i$j$a;->w:Lnq0/i;

    invoke-static {v1}, Lnq0/i;->S(Lnq0/i;)Lnq0/j;

    move-result-object v2

    const/16 v16, 0x1f1e

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lnq0/j;->b(Lnq0/j;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/whoop/domain/model/teams/MemberStory;Lh51/f;Lqv1/g;Lc41/w1;ILjava/lang/Object;)Lnq0/j;

    move-result-object v2

    invoke-static {v1, v2}, Lnq0/i;->b0(Lnq0/i;Lnq0/j;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lnq0/i$j$a;->w:Lnq0/i;

    invoke-static {v1}, Lnq0/i;->S(Lnq0/i;)Lnq0/j;

    move-result-object v2

    const/16 v16, 0x1ffe

    const/16 v17, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lnq0/j;->b(Lnq0/j;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/whoop/domain/model/teams/MemberStory;Lh51/f;Lqv1/g;Lc41/w1;ILjava/lang/Object;)Lnq0/j;

    move-result-object v2

    invoke-static {v1, v2}, Lnq0/i;->b0(Lnq0/i;Lnq0/j;)V

    iget-object v1, v0, Lnq0/i$j$a;->w:Lnq0/i;

    invoke-virtual {v1}, Lnq0/i;->I0()V

    :cond_1
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li92/h;

    invoke-virtual {p0, p1, p2}, Lnq0/i$j$a;->b(Li92/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
