.class public final Lf0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final a:Lf0/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/s0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/s0;->a:Lf0/s0;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 1

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result p3

    new-instance p4, Ldc1/c;

    const/16 v0, 0x1b

    invoke-direct {p4, v0}, Ldc1/c;-><init>(I)V

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, v0, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
