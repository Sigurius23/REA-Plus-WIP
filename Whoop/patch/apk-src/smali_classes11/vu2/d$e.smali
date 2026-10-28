.class final synthetic Lvu2/d$e;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu2/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lkotlin/jvm/functions/Function3;"
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
.field public static final w:Lvu2/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvu2/d$e;

    invoke-direct {v0}, Lvu2/d$e;-><init>()V

    sput-object v0, Lvu2/d$e;->w:Lvu2/d$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "reduceInternal(Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2DomainState;Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2InternalAction;)Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2DomainState;"

    const/4 v5, 0x5

    const/4 v1, 0x3

    const-class v2, Lvu2/e;

    const-string v3, "reduceInternal"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lvu2/c;Lvu2/f;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvu2/c;",
            "Lvu2/f;",
            "Lq83/d<",
            "-",
            "Lvu2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lvu2/d;->j(Lvu2/c;Lvu2/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvu2/c;

    check-cast p2, Lvu2/f;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvu2/d$e;->a(Lvu2/c;Lvu2/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
