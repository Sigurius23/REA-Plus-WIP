.class public final Lfc3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/d;


# static fields
.field public static final w:Lfc3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfc3/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfc3/r;->w:Lfc3/r;

    return-void
.end method


# virtual methods
.method public final getContext()Lq83/j;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
