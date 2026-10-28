.class public abstract Ln6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/i;


# instance fields
.field public a:I

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x7fffffff

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln6/k;->a:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln6/k;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 6

    const/4 v4, 0x0

    const/16 v5, 0x3e

    iget-object v0, p0, Ln6/k;->b:Ljava/util/ArrayList;

    const-string v1, ",\n"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  "

    invoke-static {v0, v1}, Lyb3/s;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
