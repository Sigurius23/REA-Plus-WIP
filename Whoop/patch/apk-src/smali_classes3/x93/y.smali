.class public final Lx93/y;
.super Lx93/a0;
.source "SourceFile"

# interfaces
.implements Lma3/e;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/y;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lx93/y;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public final c()Lo93/j;
    .locals 2

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    iget-object v1, p0, Lx93/y;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldb3/c;->b(Ljava/lang/String;)Ldb3/c;

    move-result-object v0

    invoke-virtual {v0}, Ldb3/c;->d()Lo93/j;

    move-result-object v0

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/Collection;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
