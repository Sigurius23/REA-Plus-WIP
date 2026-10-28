.class public final Lm93/k;
.super Lm93/n;
.source "SourceFile"

# interfaces
.implements Lm93/f;


# instance fields
.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm93/n;-><init>(Ljava/lang/reflect/Field;Z)V

    iput-object p2, p0, Lm93/k;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    iget-object p1, p0, Lm93/y;->a:Ljava/lang/reflect/Member;

    check-cast p1, Ljava/lang/reflect/Field;

    iget-object v0, p0, Lm93/k;->e:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
