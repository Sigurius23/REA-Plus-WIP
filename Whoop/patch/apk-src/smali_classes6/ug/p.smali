.class public final synthetic Lug/p;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lug/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lug/p;

    const-string v4, "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lug/s;

    const-string v3, "sp"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lug/p;->w:Lug/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lug/s;->a(ILjava/lang/String;)Lug/f;

    move-result-object p1

    return-object p1
.end method
