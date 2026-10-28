.class public final Luc3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc3/k;


# instance fields
.field public final a:Lr12/a;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr12/a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "whatThisExpects"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc3/o;->a:Lr12/a;

    iput-object p2, p0, Luc3/o;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Luc3/b;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p3, v0, :cond_0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v0, 0x2d

    iget-object v1, p0, Luc3/o;->a:Lr12/a;

    if-ne p2, v0, :cond_1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2}, Lr12/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v0, 0x2b

    if-ne p2, v0, :cond_2

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2}, Lr12/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Luc3/n;

    invoke-direct {p1, p0, p2}, Luc3/n;-><init>(Luc3/o;C)V

    new-instance p2, Luc3/g;

    invoke-direct {p2, p3, p1}, Luc3/g;-><init>(ILc93/a;)V

    return-object p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Luc3/o;->b:Ljava/lang/String;

    return-object v0
.end method
