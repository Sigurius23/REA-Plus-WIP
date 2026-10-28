.class public final synthetic Laa3/l;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final w:Laa3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Laa3/l;

    const-string v1, "getFlags$kotlin_metadata()I"

    const/4 v2, 0x0

    const-class v3, Laa3/a1;

    const-string v4, "flags"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Laa3/l;->w:Laa3/l;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa3/a1;

    iget p1, p1, Laa3/a1;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Laa3/a1;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iput p2, p1, Laa3/a1;->a:I

    return-void
.end method
