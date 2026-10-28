.class public final Lw3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/o;


# static fields
.field public static final a:Lw3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw3/n;->a:Lw3/n;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public final b()J
    .locals 2

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->n:J

    return-wide v0
.end method

.method public final c()Li2/t;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
