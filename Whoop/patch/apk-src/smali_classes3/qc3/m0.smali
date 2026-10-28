.class public final synthetic Lqc3/m0;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final w:Lqc3/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lqc3/m0;

    const-string v1, "getOffsetHours()Ljava/lang/Integer;"

    const/4 v2, 0x0

    const-class v3, Lqc3/v;

    const-string v4, "offsetHours"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lqc3/m0;->w:Lqc3/m0;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc3/v;

    iget-object p1, p1, Lqc3/v;->b:Ljava/lang/Integer;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lqc3/v;

    check-cast p2, Ljava/lang/Integer;

    iput-object p2, p1, Lqc3/v;->b:Ljava/lang/Integer;

    return-void
.end method
