.class public final synthetic Lba3/c;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lba3/c;

    const-string v1, "getFlags$kotlin_metadata()I"

    const/4 v2, 0x0

    const-class v3, Laa3/y0;

    const-string v4, "flags"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa3/y0;

    iget p1, p1, Laa3/y0;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Laa3/y0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iput p2, p1, Laa3/y0;->a:I

    return-void
.end method
