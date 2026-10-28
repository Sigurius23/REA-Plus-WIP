.class public final Lib3/a;
.super Lgb3/a;
.source "SourceFile"


# static fields
.field public static final m:Lib3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lib3/a;

    new-instance v1, Lwa3/i;

    invoke-direct {v1}, Lwa3/i;-><init>()V

    invoke-static {v1}, Lra3/b;->a(Lwa3/i;)V

    sget-object v2, Lra3/b;->a:Lwa3/o;

    const-string v3, "packageFqName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lra3/b;->c:Lwa3/o;

    const-string v4, "constructorAnnotation"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lra3/b;->b:Lwa3/o;

    const-string v5, "classAnnotation"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lra3/b;->d:Lwa3/o;

    const-string v6, "functionAnnotation"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lra3/b;->e:Lwa3/o;

    const-string v7, "propertyAnnotation"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lra3/b;->f:Lwa3/o;

    const-string v8, "propertyGetterAnnotation"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lra3/b;->g:Lwa3/o;

    const-string v9, "propertySetterAnnotation"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lra3/b;->i:Lwa3/o;

    const-string v10, "enumEntryAnnotation"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lra3/b;->h:Lwa3/o;

    const-string v11, "compileTimeValue"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lra3/b;->j:Lwa3/o;

    const-string v12, "parameterAnnotation"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lra3/b;->k:Lwa3/o;

    const-string v13, "typeAnnotation"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lra3/b;->l:Lwa3/o;

    const-string v14, "typeParameterAnnotation"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v0 .. v13}, Lgb3/a;-><init>(Lwa3/i;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;Lwa3/o;)V

    sput-object v0, Lib3/a;->m:Lib3/a;

    return-void
.end method

.method public static a(Lva3/e;)Ljava/lang/String;
    .locals 4

    const-string v0, "fqName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    iget-object v1, p0, Lva3/f;->a:Ljava/lang/String;

    const/16 v2, 0x2e

    const/16 v3, 0x2f

    invoke-static {v1, v2, v3}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "default-package"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p0

    const-string v1, "asString(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const-string v1, ".kotlin_builtins"

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
