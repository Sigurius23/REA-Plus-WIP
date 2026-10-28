.class public final Lbc3/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# static fields
.field public static final w:Lbc3/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbc3/e1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbc3/e1;->w:Lbc3/e1;

    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Lq83/j;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    return-object v0
.end method
