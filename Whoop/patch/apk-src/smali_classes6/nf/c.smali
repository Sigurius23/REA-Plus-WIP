.class public final Lnf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxf/a;


# static fields
.field public static final a:Lnf/c;

.field public static final b:Lgf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnf/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnf/c;->a:Lnf/c;

    sget-object v0, Lgf/i;->w:Lgf/i;

    sput-object v0, Lnf/c;->b:Lgf/i;

    return-void
.end method


# virtual methods
.method public final getAttributes()Lgf/b;
    .locals 1

    sget-object v0, Lnf/c;->b:Lgf/i;

    return-object v0
.end method
