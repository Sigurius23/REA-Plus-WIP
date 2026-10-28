.class public final synthetic Lqc3/h;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final w:Lqc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lqc3/h;

    const-string v1, "getDay()Ljava/lang/Integer;"

    const/4 v2, 0x0

    const-class v3, Lqc3/g;

    const-string v4, "day"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lqc3/h;->w:Lqc3/h;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc3/g;

    invoke-interface {p1}, Lqc3/g;->q()Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lqc3/g;

    check-cast p2, Ljava/lang/Integer;

    invoke-interface {p1, p2}, Lqc3/g;->e(Ljava/lang/Integer;)V

    return-void
.end method
