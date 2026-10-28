.class final synthetic Lwr2/c$a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwr2/c;->o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lwr2/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwr2/c$a;

    invoke-direct {v0}, Lwr2/c$a;-><init>()V

    sput-object v0, Lwr2/c$a;->w:Lwr2/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "defaultMaxEditDistance(Ljava/lang/String;Ljava/lang/String;)I"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lwr2/c;

    const-string v3, "defaultMaxEditDistance"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lwr2/c;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lwr2/c$a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
