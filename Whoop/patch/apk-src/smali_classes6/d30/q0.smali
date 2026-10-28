.class public final Ld30/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld30/r0;


# static fields
.field public static final a:Ld30/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld30/q0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld30/q0;->a:Ld30/q0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    sget-object v0, Ld30/q0;->a:Ld30/q0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
