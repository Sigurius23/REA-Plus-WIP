.class public final Lm93/z;
.super Lm93/b0;
.source "SourceFile"

# interfaces
.implements Lm93/f;


# instance fields
.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, p1, v0}, Lm93/b0;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    iput-object p2, p0, Lm93/z;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/b0;->c([Ljava/lang/Object;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lm93/b0;->a:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lm93/z;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
