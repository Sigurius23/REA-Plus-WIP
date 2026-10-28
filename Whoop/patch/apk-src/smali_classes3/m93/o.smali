.class public final Lm93/o;
.super Lm93/r;
.source "SourceFile"

# interfaces
.implements Lm93/f;


# instance fields
.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lm93/r;-><init>(Ljava/lang/reflect/Field;ZZ)V

    iput-object p3, p0, Lm93/o;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/r;->c([Ljava/lang/Object;)V

    iget-object v0, p0, Lm93/y;->a:Ljava/lang/reflect/Member;

    check-cast v0, Ljava/lang/reflect/Field;

    iget-object v1, p0, Lm93/o;->f:Ljava/lang/Object;

    invoke-static {p1}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
