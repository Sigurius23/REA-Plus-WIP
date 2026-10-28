.class public abstract Ls93/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/h;

.field public static final b:Lva3/h;

.field public static final c:Lva3/h;

.field public static final d:Lva3/h;

.field public static final e:Lva3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "message"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Ls93/e;->a:Lva3/h;

    const-string v0, "replaceWith"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Ls93/e;->b:Lva3/h;

    const-string v0, "level"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Ls93/e;->c:Lva3/h;

    const-string v0, "expression"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Ls93/e;->d:Lva3/h;

    const-string v0, "imports"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Ls93/e;->e:Lva3/h;

    return-void
.end method

.method public static final a(Lo93/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ls93/l;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replaceWith"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls93/l;

    sget-object v1, Lo93/m;->o:Lva3/e;

    new-instance v2, Lab3/x;

    invoke-direct {v2, p2}, Lab3/g;-><init>(Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    sget-object v3, Ls93/e;->d:Lva3/h;

    invoke-direct {p2, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lab3/b;

    new-instance v3, Ls;

    const/16 v4, 0x13

    invoke-direct {v3, p0, v4}, Ls;-><init>(Ljava/lang/Object;I)V

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-direct {v2, v4, v3}, Lab3/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Ll83/k;

    sget-object v4, Ls93/e;->e:Lva3/h;

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p2, v3}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    invoke-direct {v0, p0, v1, p2}, Ls93/l;-><init>(Lo93/h;Lva3/e;Ljava/util/Map;)V

    new-instance p2, Ls93/l;

    sget-object v1, Lo93/m;->m:Lva3/e;

    new-instance v2, Lab3/x;

    invoke-direct {v2, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    sget-object v3, Ls93/e;->a:Lva3/h;

    invoke-direct {p1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lab3/a;

    invoke-direct {v2, v0}, Lab3/g;-><init>(Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    sget-object v3, Ls93/e;->b:Lva3/h;

    invoke-direct {v0, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lab3/i;

    sget-object v3, Lo93/m;->n:Lva3/e;

    const-string v4, "topLevelFqName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lva3/c;

    invoke-virtual {v3}, Lva3/e;->b()Lva3/e;

    move-result-object v5

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->g()Lva3/h;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {p3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p3

    invoke-direct {v2, v4, p3}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    new-instance p3, Ll83/k;

    sget-object v3, Ls93/e;->c:Lva3/h;

    invoke-direct {p3, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1, v0, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, p0, v1, p1}, Ls93/l;-><init>(Lo93/h;Lva3/e;Ljava/util/Map;)V

    return-object p2
.end method

.method public static synthetic b(Lo93/h;)Ls93/l;
    .locals 3

    const-string v0, ""

    const-string v1, "WARNING"

    const-string v2, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    invoke-static {p0, v2, v0, v1}, Ls93/e;->a(Lo93/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ls93/l;

    move-result-object p0

    return-object p0
.end method
