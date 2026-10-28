.class public final synthetic Lv6/u;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lv6/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lv6/u;

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lv6/m;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lv6/u;->w:Lv6/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lv6/m;

    invoke-direct {v0}, Lv6/m;-><init>()V

    return-object v0
.end method
