.class public final Lu0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final a:Lu0/e0;

.field public static final b:Ldc1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu0/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu0/e0;->a:Lu0/e0;

    new-instance v0, Ldc1/c;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    sput-object v0, Lu0/e0;->b:Ldc1/c;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 1

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result p2

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    sget-object p4, Lu0/e0;->b:Ldc1/c;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, v0, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
