.class final Lo92/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lo92/i;


# direct methods
.method public constructor <init>(Lo92/i;)V
    .locals 0

    iput-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lgt0/h;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgt0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    instance-of v0, p1, Lgt0/h$e;

    const-string v1, "body"

    const-string v2, "title"

    if-eqz v0, :cond_0

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object p1

    sget v0, Lhi0/j;->f0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object p1

    sget v0, Lhi0/j;->e0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->B(Lo92/i;)Lgt0/d;

    move-result-object v0

    sget-object v1, Lgt0/b;->NOTIFICATION:Lgt0/b;

    sget-object v2, Lgt0/c;->UPDATE_SUCCESS:Lgt0/c;

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->A(Lo92/i;)Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lgt0/h$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {v0}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object v0

    sget v3, Lhi0/j;->h0:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lgt0/h;->a:Lgt0/h$a;

    invoke-virtual {v0, p1}, Lgt0/h$a;->c(Lgt0/h;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object p1

    sget v0, Lhi0/j;->g0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object p1

    sget v0, Lhi0/j;->i0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->B(Lo92/i;)Lgt0/d;

    move-result-object v0

    sget-object v1, Lgt0/b;->NOTIFICATION:Lgt0/b;

    sget-object v2, Lgt0/c;->FAILURE:Lgt0/c;

    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p1}, Lo92/i;->A(Lo92/i;)Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    :goto_1
    iget-object p1, p0, Lo92/i$b$a;->w:Lo92/i;

    new-instance v0, Lm92/f;

    invoke-direct {v0, p2}, Lm92/f;-><init>(Ljava/util/Map;)V

    iget-object p2, p0, Lo92/i$b$a;->w:Lo92/i;

    invoke-static {p2}, Lo92/i;->z(Lo92/i;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lo92/i;->a(Lm92/f;Landroid/content/Context;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgt0/h;

    invoke-virtual {p0, p1, p2}, Lo92/i$b$a;->b(Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
