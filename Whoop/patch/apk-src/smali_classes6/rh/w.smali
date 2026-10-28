.class public final synthetic Lrh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrh/u;


# virtual methods
.method public final newImageLoader(Landroid/content/Context;)Lrh/n;
    .locals 3

    new-instance v0, Lrh/m;

    invoke-direct {v0, p1}, Lrh/m;-><init>(Landroid/content/Context;)V

    sget-object p1, Lrh/x;->b:Lf93/a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, v0, Lrh/m;->f:Lrh/h;

    invoke-virtual {v2, p1, v1}, Lrh/h;->a(Lf93/a;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lrh/m;->a()Lrh/t;

    move-result-object p1

    return-object p1
.end method
