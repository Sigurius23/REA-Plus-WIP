.class public final synthetic Lqc3/r0;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final w:Lqc3/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lqc3/r0;

    const-string v1, "getAmPm()Lkotlinx/datetime/format/AmPmMarker;"

    const/4 v2, 0x0

    const-class v3, Lqc3/q0;

    const-string v4, "amPm"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lqc3/r0;->w:Lqc3/r0;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc3/q0;

    invoke-interface {p1}, Lqc3/q0;->j()Lqc3/f;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lqc3/q0;

    check-cast p2, Lqc3/f;

    invoke-interface {p1, p2}, Lqc3/q0;->t(Lqc3/f;)V

    return-void
.end method
