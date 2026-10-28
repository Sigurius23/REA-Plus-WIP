.class public final Lv1/b;
.super Lm83/k;
.source "SourceFile"

# interfaces
.implements Ls1/e;


# static fields
.field public static final z:Lv1/b;


# instance fields
.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public final y:Lu1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv1/b;

    sget-object v1, Lw1/b;->a:Lw1/b;

    sget-object v2, Lu1/c;->y:Lu1/c;

    invoke-direct {v0, v1, v1, v2}, Lv1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu1/c;)V

    sput-object v0, Lv1/b;->z:Lv1/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lu1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/b;->w:Ljava/lang/Object;

    iput-object p2, p0, Lv1/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lv1/b;->y:Lu1/c;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lv1/b;->y:Lu1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lu1/c;->x:I

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lv1/b;->y:Lu1/c;

    invoke-virtual {v0, p1}, Lu1/c;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, La0/t0;

    iget-object v1, p0, Lv1/b;->w:Ljava/lang/Object;

    iget-object v2, p0, Lv1/b;->y:Lu1/c;

    invoke-direct {v0, v1, v2}, La0/t0;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    return-object v0
.end method
