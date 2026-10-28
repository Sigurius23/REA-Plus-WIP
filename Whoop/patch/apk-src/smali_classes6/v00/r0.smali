.class public final Lv00/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:Lm3/g;

.field public final synthetic x:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lm3/g;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv00/r0;->w:Lm3/g;

    iput-object p2, p0, Lv00/r0;->x:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lv00/s0;

    iget-object v0, p0, Lv00/r0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lv00/s0;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    iget-object v0, p0, Lv00/r0;->w:Lm3/g;

    invoke-virtual {v0, p1, p2}, Lm3/g;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
