.class public final Loa3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb3/j;


# instance fields
.field public final w:Lw93/b;


# direct methods
.method public constructor <init>(Lw93/b;Ljb3/x;Ljb3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loa3/q;->w:Lw93/b;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Loa3/q;->w:Lw93/b;

    iget-object v1, v1, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {v1}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-virtual {v1}, Lva3/c;->a()Lva3/e;

    move-result-object v1

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    iget-object v1, v1, Lva3/f;->a:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Loa3/q;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loa3/q;->w:Lw93/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
