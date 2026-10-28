.class public final Lx30/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# static fields
.field public static final a:Lx30/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx30/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx30/g;->a:Lx30/g;

    return-void
.end method


# virtual methods
.method public final a(Ll3/g;)Lq3/e0;
    .locals 6

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {p1}, Lyb3/r;->S(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "-"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lq3/e0;

    new-instance v1, Ll3/g;

    const/4 v3, 0x6

    invoke-direct {v1, v3, p1, v2}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    sget-object p1, Lx30/f;->x:Lx30/f;

    invoke-direct {v0, v1, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0
.end method
